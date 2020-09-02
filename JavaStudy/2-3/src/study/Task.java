package study;
// ① TaskクラスにCalculatorクラスを継承させなさい。
class Task extends Calculator {

    /**
     * タスクの実行
     */
    public void doTask() {
        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、下記画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
    	int sum_1 = super.plus(10);
    	System.out.println(sum_1);
    	int sum_2 = super.plus(10,20);
    	System.out.println(sum_2);
    	int sum_3 = super.plus(10,20,30);
    	System.out.println(sum_3);
    }
}