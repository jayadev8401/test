import org.apache.spark.{SparkConf, SparkContext}

object hello {
  def main(args: Array[String]) {
    val conf = new SparkConf()
      .setMaster("local")
      .setAppName("Word Count")

    val sc = new SparkContext(conf)
    val input = "building jenkins pipeline"
    val count = input.split(" ").map(word ⇒ (word, 1))
    println("OK")
  }
}
