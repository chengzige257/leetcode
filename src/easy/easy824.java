package easy;

public class easy824 {//山羊拉丁文
    public String toGoatLatin(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = sentence.split(" ");
        for(int i=0;i<words.length;i++){
            stringBuilder.append(change(words[i],i+1)).append(' ');
        }
        return stringBuilder.deleteCharAt(stringBuilder.length()-1).toString();
    }
    public String change(String word,int count){
        char c = word.charAt(0);
        int length = word.length();
        StringBuilder stringBuilder = new StringBuilder();
        if(c=='e'||c=='a'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            stringBuilder.append(word).append("ma");
        }else{
            stringBuilder.append(word.substring(1)).append(c).append("ma");
        }
        for(int i = 1;i<=count;i++){
            stringBuilder.append('a');
        }
        return stringBuilder.toString();
    }
}
