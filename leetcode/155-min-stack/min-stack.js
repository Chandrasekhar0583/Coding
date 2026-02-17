
var MinStack = function() {
    this.stack = [];
    this.min = Infinity;
    this.ind = 0;
};

/** 
 * @param {number} val
 * @return {void}
 */
MinStack.prototype.push = function(val) {
    if(this.stack.length === 0 ){
        this.stack.push([val ,val]);
        this.ind++;
        this.min = val;
    }
    else{
        this.min = Math.min(this.min , val);
        this.ind++;
        this.stack.push([val , this.min]);
    }
};

/**
 * @return {void}
 */
MinStack.prototype.pop = function() {
    if(this.ind > 0){
        this.ind--;
        const last =  this.stack.pop();
        if(last[1] === this.min){
            this.min = this.ind > 0 ?this.stack[this.ind - 1][1] : Infinity;
        }
    }
};

/**
 * @return {number}
 */
MinStack.prototype.top = function() {
    if(this.ind > 0)
    return this.stack[this.ind - 1][0];
    return -1;
};

/**
 * @return {number}
 */
MinStack.prototype.getMin = function() {
    return this.min;
};

/** 
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */