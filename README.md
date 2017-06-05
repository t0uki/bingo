# bingo

ビンゴゲーム

コメント

	•	Javaを用いたビンゴゲームのソースコードの参考資料が少なかったので作成してみました。よろしければ参考にどうぞ。
	•	ビンゴカードはint配列で作成してありますがStringやListを使うのも面白いと思います。その際は各判定をその型に合わせたものに変更してください。
	•	Card.javaのprintDebug()メソッドはデバッグ用のカード出力メソッドです。標準のカード出力(printCard()メソッド)は一致した数値が■で表示されますがデバッグ用は()付きで数字が表示されます。好みで標準出力とデバッグ出力を切り替えてください。


開発環境

	Eclipse 4.6 Neon for Mac OS X / Java version 1.8.0_111



仕様

	•	CUIのビンゴ
	•	ボールおよびカードの値はランダムで出現
	•	ボール、カードともに一度出た数字は出現しない
	•	真ん中は初めから穴が空いている状態
	•	一致した数字は■で表示
	•	カードの法則は
	 B列：1~15
	 I列：16~30
	 N列：31~45
	 G列：46~60
	 O列：61~75

パッケージ構成
Bingo directory

	L main
	|   L Main.java
	|
	L proccess
	|   L BingoSys.java
	|   L Judg.java
	|
	L state
	    L Already.java
	    L Ball.java
	    L Card.java

説明

	・main.java
	開始時と終了時にテキスト出力。
	処理はBingoSys.java

	・BingoSys.java
	ビンゴカード、ボール作成
	現在のカード、ボール、ビンゴおよびリーチの数を表示
	途中終了処理

	Judg.java
	ビンゴ、リーチ判定
	ビンゴカードの位置とボールの値が一致しているか判定

	Already.java
	既出の数字が出ていないか確認

	Ball.java
	ランダムな1~75のボールを作成

	Card.java
	ランダムな1~75の値をセットしたカードの作成、表示

