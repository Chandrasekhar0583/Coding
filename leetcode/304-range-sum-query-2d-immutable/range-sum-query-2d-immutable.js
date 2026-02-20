var NumMatrix = function(matrix) {
    if (!matrix || matrix.length === 0 || matrix[0].length === 0) {
        this.arr = [];
        return;
    }

    let n = matrix.length;
    let m = matrix[0].length;

    this.arr = Array.from({ length: n }, () => new Array(m).fill(0));

    for (let i = 0; i < n; i++) {
        for (let j = 0; j < m; j++) {
            let top = i > 0 ? this.arr[i - 1][j] : 0;
            let left = j > 0 ? this.arr[i][j - 1] : 0;
            let diag = (i > 0 && j > 0) ? this.arr[i - 1][j - 1] : 0;

            this.arr[i][j] = matrix[i][j] + top + left - diag;
        }
    }
};

NumMatrix.prototype.sumRegion = function(row1, col1, row2, col2) {
    if (this.arr.length === 0) return 0;

    let total = this.arr[row2][col2];
    let top = row1 > 0 ? this.arr[row1 - 1][col2] : 0;
    let left = col1 > 0 ? this.arr[row2][col1 - 1] : 0;
    let diag = (row1 > 0 && col1 > 0) ? this.arr[row1 - 1][col1 - 1] : 0;

    return total - top - left + diag;
};