class Solution {
  public List<Character> frequencySort(String s) {
    int n = s.length();
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      char ch = s.charAt(i);
      if (map.containsKey(ch)) {
        map.put(ch, map.get(ch) + 1);
      } else {
        map.put(ch, 1);
      }
    }

    List<Character> sortedChar = new ArrayList<>(map.keySet());
    Collections.sort(
        sortedChar,
        (a, b) -> {
          int freqDiff = map.get(b) - map.get(a); // Frequency descending
          if (freqDiff != 0) return freqDiff;
          return a - b; // Alphabetical
        });

    return sortedChar;
  }
}
