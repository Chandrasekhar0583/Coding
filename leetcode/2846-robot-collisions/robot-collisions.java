class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        Ro[] robots = new Ro[n];
        for (int i = 0; i < n; i++) {
            robots[i] = new Ro(positions[i], healths[i], directions.charAt(i), i);
        }
        Arrays.sort(robots, Comparator.comparingInt(r -> r.position));
        Stack<Ro> stk = new Stack<>();
        
        for (Ro robot : robots) {
            if (robot.direction == 'R') {
                stk.push(robot);
            } else {
                while (!stk.isEmpty() && stk.peek().direction == 'R') {
                    Ro rightRo = stk.pop();
                    if (rightRo.health > robot.health) {
                        rightRo.health--;
                        robot.health = 0;
                        stk.push(rightRo);
                        break;
                    } else if (rightRo.health < robot.health) {
                        robot.health--;
                    } else {
                        robot.health = 0;
                        break;
                    }
                }
                if (robot.health > 0) {
                    stk.push(robot);
                }
            }
        }
        List<Ro> remain = new ArrayList<>(stk);
        remain.sort(Comparator.comparingInt(r -> r.index));
       int[] result = new int[remain.size()];
        for (int i = 0; i < remain.size(); i++) {
            result[i] = remain.get(i).health;
        }
        List<Integer> res= new ArrayList<>();
        for(int i:result)
        {
            res.add(i);
        }
        return res;
    }
    
    static class Ro {
        int position;
        int health;
        char direction;
        int index;
        
        Ro(int position, int health, char direction, int index) {
            this.position = position;
            this.health = health;
            this.direction = direction;
            this.index = index;
        }
    }
    
}