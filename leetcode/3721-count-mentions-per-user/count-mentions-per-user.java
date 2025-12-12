class Solution {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {

       
        events.sort(
            Comparator
                .comparingInt(e -> Integer.parseInt(((List<String>) e).get(1)))
                .thenComparing(e -> ((List<String>) e).get(0).equals("OFFLINE") ? 0 : 1)
        );

        int[] mentions = new int[numberOfUsers];
        int[] offlineUntil = new int[numberOfUsers];

        Arrays.fill(offlineUntil, 0);

        for (List<String> ev : events) {

            String type = ev.get(0);
            int time = Integer.parseInt(ev.get(1));
            String data = ev.get(2);

            if (type.equals("OFFLINE")) {

                int user = Integer.parseInt(data);
                offlineUntil[user] = time + 60;

            } else { 

                if (data.equals("ALL")) {

                    for (int u = 0; u < numberOfUsers; u++)
                        mentions[u]++;

                } else if (data.equals("HERE")) {

                    for (int u = 0; u < numberOfUsers; u++)
                        if (time >= offlineUntil[u])
                            mentions[u]++;

                } else {
                
                    String[] ids = data.split(" ");

                    for (String s : ids) {
                        int user = Integer.parseInt(s.substring(2)); 
                        mentions[user]++;
                    }
                }
            }
        }

        return mentions;
    }
}
