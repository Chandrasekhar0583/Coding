class Spreadsheet {
    int sheet[][] ;
    public Spreadsheet(int rows) {
        sheet = new int[rows + 1][26];
    }
    
    public void setCell(String cell, int value) {
        int col = cell.charAt(0) - 'A';
        int row = Integer.parseInt(cell.substring(1));
        sheet[row][col] = value;
    }
    
    public void resetCell(String cell) {
        int col = cell.charAt(0) - 'A';
        int row = Integer.parseInt(cell.substring(1));
        sheet[row][col] = 0;
        
    }
    
    public int getValue(String f) {
        String arr[] = f.split("\\+");
        int val = 0;
        if(Character.isLetter(arr[0].charAt(1)))
        {
        int col = arr[0].charAt(1) - 'A';
        int row = Integer.parseInt(arr[0].substring(2));
        val = sheet[row][col];
        }
        else{
            val = Integer.parseInt(arr[0].substring(1));
        }
        if(Character.isLetter(arr[1].charAt(0)))
        {
        int col = arr[1].charAt(0) - 'A';
        int row = Integer.parseInt(arr[1].substring(1));
        val += sheet[row][col];
        }
        else{
            val += Integer.parseInt(arr[1].substring(0));
        }
        return val;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */