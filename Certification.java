// 資格情報を表すクラス
public class Certification {
  private String licenseName; // 資格名
  private int    year;        // 取得年
  private int    month;       // 取得月 (1-12)

  // コンストラクタ
  // monthが1〜12の範囲外の場合は無視される
  public Certification(String licenseName, int year, int month) {
    if (1 <= month && month <= 12) {
      this.licenseName = licenseName;
      this.year        = year;
      this.month       = month;
    }
  }

  // 資格情報を"資格名:年/月"形式で返す
  public String getCertification() {
    return this.licenseName + ":" + this.year + "/" + this.month;
  }
}