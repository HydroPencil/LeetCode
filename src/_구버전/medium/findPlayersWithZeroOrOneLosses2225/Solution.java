package medium.findPlayersWithZeroOrOneLosses2225;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> players = new HashSet<>();
        Set<Integer> oneLoss = new HashSet<>();
        List<Integer> losser = new ArrayList<>();

        for(int[] i : matches){
            players.add(i[0]);
            players.add(i[1]);
            losser.add(i[1]);
        }

        Collections.sort(losser);
        ListIterator<Integer> it = losser.listIterator();
        while(it.hasNext()){
            int current = it.next();
            players.remove(current);
            if(oneLoss.remove(current)){
                while(it.hasNext()){
                    int next = it.next();
                    if(next!=current){
                        next = it.previous();
                        break;
                    }
                }
                continue;
            }
            oneLoss.add(current);
        }

        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> playerList = new ArrayList<>(players);
        ArrayList<Integer> LossList = new ArrayList<>(oneLoss);
        Collections.sort(playerList);
        Collections.sort(LossList);
        ans.add(playerList);
        ans.add(LossList);
        return ans;
    }
}