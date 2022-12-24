package org.example;
import jdk.jfr.DataAmount;

import java.util.Objects;
import java.util.Random;

public class MyHashMap <K, V> {

    private static int numberOfNodes =0;
    private Node[] hashTable;

    public MyHashMap(Node[] hashTable) {
        this.hashTable = hashTable;
    }

    public class Node {
        private K key;
        private V value;
        private Node next;

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public Node put(K key, V value) {
        Node node = new Node();
        int bucket = node.hashCode();
        node.setValue(value);
        node.setKey(key);
        if(this.hashTable[bucket] == null) {
            this.hashTable[bucket] = node;
            return node;
        } else {
            Node emptyLinkNode = findEmptyLinkNode(hashTable[bucket]);
            emptyLinkNode.setNext(node);
            return emptyLinkNode;
        }
    }

    public Node remove(K key) {
        for (int i = 0; i < this.hashTable.length; i++) {
            Node nodeToRemove = hashTable[i];
            if (isFirstAndLast(nodeToRemove, key)) {
                hashTable[i] = null;
                return nodeToRemove;
            } else if (isFirstAndLast(nodeToRemove, key)) {
                hashTable[i] = nodeToRemove.getNext();
                return nodeToRemove;
            } else if (nodeToRemove != null && nodeToRemove.getNext() != null) {
                deleteNodeByKey(hashTable[i], hashTable[i].getNext(), key);
            }
        }
        return null;
    }

    public int size() {
        numberOfNodes = 0;
        for (Node node : this.hashTable) {
            if (node != null) {
                numberOfNodes++;
                calcAmountLinkedNodes(node);
            }
        }
        return numberOfNodes;
    }

    public V get(K key){
        for(Node node : this.hashTable) {
            if(node!=null && node.getKey().equals(key)) {
                return node.getValue();
            }
            else if(node!=null) {
                return findNodeByKey(node, key);
            }
        }
    return null;
    }

    public void clear() {
        for (int i = 0; i < this.hashTable.length; i++) {
            hashTable[i] = null;
        }
    }

    private Node findEmptyLinkNode(Node node) {
        if(node.getNext() != null) {
            return node;
        }
        return findEmptyLinkNode(node.getNext());
    }

    public void calcAmountLinkedNodes(Node node) {
        if (node.next != null) {
            numberOfNodes++;
            calcAmountLinkedNodes(node.getNext());
        }
    }

    private V findNodeByKey(Node node, K key) {
        if (node.getKey().equals(key)) {
            return node.getValue();
        }
        if (node.getNext() != null) {
            return findNodeByKey(node.getNext(), key);
        }
        return null;
    }

    public void deleteNodeByKey(Node previousNode, Node currentNode, K key) {
        if(currentNode.getKey().equals(key) && currentNode.getNext()!=null) {
            previousNode.setNext(currentNode.getNext());
        } else if(currentNode.getKey().equals(key) && currentNode.getNext()==null) {
            previousNode.setNext(null);
        } else if(currentNode.getNext()!=null) {
            deleteNodeByKey(currentNode, currentNode.getNext(), key);
        }
    }

    private boolean isFirstAndLast(Node node, K key) {
        return node!=null && node.getKey().equals(key) && node.getNext() == null;
    }

    private boolean isFirstAndNotLast(Node node, K key) {
        return node!=null && node.getKey().equals(key);
    }

        @Override
        public int hashCode() {
            Random random = new Random();
            return random.nextInt(12);
        }

        @Override
        public boolean equals(Object obj) {
            if(this == obj) return true;
            if(obj == null || getClass() != obj.getClass()) return false;
            Node node = (Node) obj;
            return Objects.equals(get(node.key), node.getKey()) && Objects.equals(node.value, node.getValue()) && Objects.equals(node.next, node.getNext());
        }

}


