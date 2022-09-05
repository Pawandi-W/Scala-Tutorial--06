def Encrypt( ) : String = {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size
  val inputText = scala.io.StdIn.readLine("Message: ")
  val outputText = inputText.map( (c: Char) => {
    val x = alphabet.indexOf(c.toUpper)
    if (x == -1){
      c
    }
    else{
      alphabet((x + shift) % alphabet.size)
      }
  });
  println("Secret Message: "+ outputText);
  return outputText;
   }

   def Decrypt( ) : String = {
     val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
     val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size
     val inputText = scala.io.StdIn.readLine("Message: ")
     val outputText = inputText.map( (c: Char) => {
       val x = alphabet.indexOf(c.toUpper)
       if (x == -1){
         c
       }
       else{
         alphabet((x - shift) % alphabet.size)
         }
     });
     println("Secret Message: "+ outputText);
     return outputText;
      }

print("Encrypt(E) or Decrypt(D): ");
val t = scala.io.StdIn.readLine();
if(t== "E"){
  Encrypt();
}
else if (t== "D"){
  Decrypt();
}
else {
  println("Invalid Option");
}
