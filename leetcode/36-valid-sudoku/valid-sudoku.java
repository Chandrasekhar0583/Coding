class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, ArrayList<Integer>> row = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> col = new HashMap<>();
        HashMap<Integer, ArrayList<Integer>> box = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            row.put(i, new ArrayList<>());
            col.put(i, new ArrayList<>());
            box.put(i, new ArrayList<>());
        }
        int c = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!("" + board[i][j]).equals(".")) {
                    int index = (i / 3)*3 + (j / 3);
                    ArrayList<Integer> n = row.get(i);
                    ArrayList<Integer> n1 = col.get(j);
                    ArrayList<Integer> n2 = box.get(index);
                    int x = Integer.parseInt("" + board[i][j]);
                    if (n.contains(x) || n1.contains(x) || n2.contains(x)) {
                        return false;
                    }
                    n.add(x);
                    n1.add(x);
                    n2.add(x);
                    row.put(i, n);
                    col.put(j, n1);
                    box.put(index, n2);
                }
            }
        }
        return true;
    }
}