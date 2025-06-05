// 人物情報を表すクラス
public class Person {
  private String        name; // 名前
  private Certification cert; // 資格情報

  // コンストラクタ
  public Person(String name, Certification cert) {
    this.name = name;
    this.cert = cert;
  }

  // 名前を取得する（ゲッター）
  public String getName() {
    return this.name;
  }

  // 資格情報を文字列で取得する
  public String getCertification() {
    return this.cert.getCertification();
  }
}