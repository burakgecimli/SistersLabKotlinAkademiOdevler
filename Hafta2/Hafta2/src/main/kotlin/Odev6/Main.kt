package Odev6

/**
 * Null-safety'nin diğer programlama dilleriyle karşılaştırıldığında avantajları nelerdir?
 * Kotlin'in null-safety özelliği neden diğer dillerden farklıdır?
 */


/**
 * Null-safety, null referansların neden olduğu hataları veya istisnaları önlemeye veya azaltmaya yardımcı olur.
 * NullPointerException önemli bir hatadır çünkü önceden görmek çok zordur, uygulamanın çalışma zamanında ortaya çıkar
 * ve uygulamanın çökmesine neden olur.
 *   Kotlin bu tip durumları engellemek için Null Safety özelliğini dile eklemiştir.
 *   Kotlin null safety, Kotlin kodunun daha güvenli ve performanslı olmasını sağlar.
 *   Bu, Kotlin’in derleyici seviyesinde null-safety sağladığı ve nullable referanslara güvenli olmayan
 *   bir şekilde erişilmesini engellediği anlamına gelir.
 *
 */


/** Örnegin Java ile yazılmış bir kod string parametresine null gönderirsek bize null olan değerin uzunluğu olayacağı
 * için `NullPointerException` fırlatacaktır.
 *
 *   =Java Kodu=
 *  int stringLength(String a) {
 *     return a.length();
 *  }
 *
 * void main() {
 *     stringLength(null); // Throws a `NullPointerException`
 * }
 *
 * =Kotlin Kodu=
 * fun stringLength(a: String?): Int = if (a != null) a.length else 0
 *

 */


fun main() {

//Kaynak https://kotlinlang.org/docs/java-to-kotlin-nullability-guide.html#checking-the-result-of-a-function-call
}