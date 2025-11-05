import java.util.*;

class Solution {
    static class Element implements Comparable<Element> {
        int freq;
        int val;
        
        Element(int freq, int val) {
            this.freq = freq;
            this.val = val;
        }
        
        @Override
        public int compareTo(Element other) {
            if (this.freq != other.freq) {
                return Integer.compare(this.freq, other.freq);
            }
            return Integer.compare(this.val, other.val);
        }
        
        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Element)) return false;
            Element other = (Element) obj;
            return this.freq == other.freq && this.val == other.val;
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(freq, val);
        }
    }
    
    private TreeSet<Element> top;
    private TreeSet<Element> bottom;
    private long topSum;
    private int x;
    
    public long[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        long[] result = new long[n - k + 1];
        this.x = x;
        
        Map<Integer, Integer> freq = new HashMap<>();
        top = new TreeSet<>();
        bottom = new TreeSet<>();
        topSum = 0;
        
        for (int i = 0; i < k; i++) {
            addElement(nums[i], freq);
        }
        
        result[0] = topSum;
        
        for (int i = k; i < n; i++) {
            removeElement(nums[i - k], freq);
            addElement(nums[i], freq);
            result[i - k + 1] = topSum;
        }
        
        return result;
    }
    
    private void addElement(int val, Map<Integer, Integer> freq) {
        int oldFreq = freq.getOrDefault(val, 0);
        int newFreq = oldFreq + 1;
        freq.put(val, newFreq);
        
        if (oldFreq > 0) {
            Element oldElem = new Element(oldFreq, val);
            removeFromSets(oldElem);
        }
        
        Element newElem = new Element(newFreq, val);
        bottom.add(newElem);
        moveBottomToTop();
    }
    
    private void removeElement(int val, Map<Integer, Integer> freq) {
        int oldFreq = freq.get(val);
        int newFreq = oldFreq - 1;
        
        Element oldElem = new Element(oldFreq, val);
        removeFromSets(oldElem);
        
        if (newFreq > 0) {
            freq.put(val, newFreq);
            Element newElem = new Element(newFreq, val);
            bottom.add(newElem);
        } else {
            freq.remove(val);
        }
        
        moveBottomToTop();
    }
    
    private void removeFromSets(Element elem) {
        if (top.remove(elem)) {
            topSum -= (long) elem.freq * elem.val;
        } else {
            bottom.remove(elem);
        }
    }
    
    private void moveBottomToTop() {
        int totalDistinct = top.size() + bottom.size();
        int targetSize = Math.min(x, totalDistinct);
        
        while (top.size() > targetSize) {
            Element smallest = top.pollFirst();
            topSum -= (long) smallest.freq * smallest.val;
            bottom.add(smallest);
        }
        
        while (top.size() < targetSize && !bottom.isEmpty()) {
            Element largest = bottom.pollLast();
            top.add(largest);
            topSum += (long) largest.freq * largest.val;
        }
        
        while (!bottom.isEmpty() && !top.isEmpty()) {
            Element smallestTop = top.first();
            Element largestBottom = bottom.last();
            
            if (largestBottom.compareTo(smallestTop) > 0) {
                top.pollFirst();
                topSum -= (long) smallestTop.freq * smallestTop.val;
                bottom.add(smallestTop);
                
                bottom.pollLast();
                top.add(largestBottom);
                topSum += (long) largestBottom.freq * largestBottom.val;
            } else {
                break;
            }
        }
    }
}
