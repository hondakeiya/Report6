package jp.ac.uryukyu.ie.e195721;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("HiGH&LOWを始めます！");
        System.out.println("ルール説明は入りますか？YesかNoで答えてください！");
        System.out.println("Input > ");
        String input1 = scanner.nextLine();
        if(input1.length()==3){
            System.out.println("・トランプの強さ\nＡ＜２＜３＜４＜５＜６＜７＜８＜９＜１０＜Ｊ＜Ｑ＜Ｋ\n\n・遊び方\n1.進行役がトランプをよく切り、1枚引いて公開します。\n" +
                    "2.参加者は自分が引くカードが、そのカードよりも大きかったら「HiGH」、小さかったら「LOW」と入力してください。\n" +
                    "3.カードを選んで引きます。正解ならゲームを続け、不正解なら負けでゲーム終了です。\n" +
                    "4.1〜3を繰り返して5回連続で正解したら貴方の勝ちです。");
        }
        else{
            System.out.println("ルール説明を省略します。");
        }
        System.out.println("では、ゲームを始めます。");
    }
}
