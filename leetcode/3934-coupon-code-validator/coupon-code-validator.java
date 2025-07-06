class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        ArrayList<String[]> valid = new ArrayList<>();
        int n = code.length;

        for (int i = 0; i < n; i++) {
            if (code[i].length() == 0) continue;

            boolean flag = true;
            for (char c : code[i].toCharArray()) {
                if (!Character.isLetterOrDigit(c) && c != '_') {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                String s = businessLine[i];
                if ((s.equals("electronics") || s.equals("grocery") || s.equals("pharmacy") || s.equals("restaurant")) && isActive[i]) {
                    valid.add(new String[]{s, code[i]});
                }
            }
        }

        Map<String, Integer> priority = new HashMap<>();
        priority.put("electronics", 0);
        priority.put("grocery", 1);
        priority.put("pharmacy", 2);
        priority.put("restaurant", 3);

        valid.sort((a, b) -> {
            int cmp = Integer.compare(priority.get(a[0]), priority.get(b[0]));
            if (cmp == 0) return a[1].compareTo(b[1]);
            return cmp;
        });

        List<String> result = new ArrayList<>();
        for (String[] arr : valid) {
            result.add(arr[1]);
        }

        return result;
    }
}
