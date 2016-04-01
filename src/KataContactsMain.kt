/**
 * Created by hugomatilla on 31/03/16.
 * Property of scondoo GmbH
 */

fun main(args: Array<String>) {
    val view = View()
    while (true) {
        val line = readLine()
        view.readNewLine(line!!)
        view.showContacts()
    }
}