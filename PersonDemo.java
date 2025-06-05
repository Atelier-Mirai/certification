// PersonクラスとCertificationクラスの動作を確認するデモクラス
public class PersonDemo {
  public static void main(String[] args) {
    // 基本情報処理技術者の資格情報を作成
    Certification fe = new Certification("基本情報処理技術者", 2019, 6);
    // 太郎さん（基本情報保持）を作成
    Person taro      = new Person("日立太郎", fe);

    // 応用情報処理技術者の資格情報を作成
    Certification ap = new Certification("応用情報処理技術者", 2020, 6);
    // 花子さん（応用情報保持）を作成
    Person hanako    = new Person("日立花子", ap);

    // 各人物の名前と資格情報を表示
    System.out.println(taro.getName());            // 太郎の名前を表示
    System.out.println(taro.getCertification());   // 太郎の資格情報を表示
    System.out.println(hanako.getName());          // 花子の名前を表示
    System.out.println(hanako.getCertification()); // 花子の資格情報を表示
  }
}