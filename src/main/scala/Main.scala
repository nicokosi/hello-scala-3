@main def hello(): Unit = println("Hello Scala 3! 👋")

case class User(id: Int, name: String)
case class Email(address: String)
def help(id: User | Email): Unit =
  id match
    case User(_, name) => println(s"Need help, $name?")
    case Email(address) => println(s"Support email has been sent to $address")
@main def unionType(): Unit =
  help(User(123, "John Doe"))
  help(Email("JohnDoe@myprovider.com"))