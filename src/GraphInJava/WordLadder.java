package GraphInJava;

//https://leetcode.com/problems/word-ladder/

import java.util.*;

public class WordLadder {
    public static void main(String[] args){
        String beginWord = "hit";
        String endWord = "cog";
        List<String> list = new ArrayList<>();
        //"hot","dot","dog","lot","log","cog"
        list.add("hot");
        list.add("dot");
        list.add("dog");
        list.add("lot");
        list.add("log");
        list.add("cog");
        System.out.println(ladderLength(beginWord,endWord,list));
    }
    public static class Node{
        String s;
        int step;
        Node(String s, int step){
            this.s = s;
            this.step = step;
        }
    }
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {

        HashSet<String> set = new HashSet<>(wordList);

        set.remove(beginWord);
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(beginWord,1));


        while (!q.isEmpty()){
            String word = q.peek().s;
            int steps = q.peek().step;
            q.remove();

            if(word.equals(endWord))
                return steps;

            for (int i = 0; i < word.length(); i++) {

                for (char ch = 'a'; ch <= 'z'; ch++){
                    char[] arr = word.toCharArray();
                    arr[i] = ch;

                    String replaceWord = new String(arr);

                    if(set.contains(replaceWord)){
                        set.remove(replaceWord);
                        q.offer(new Node(replaceWord,steps+1));
                    }
                }
            }

        }
        return 0;

    }
}
