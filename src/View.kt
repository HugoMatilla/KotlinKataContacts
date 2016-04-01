/**
 * Created by hugomatilla on 31/03/16.
 * Property of scondoo GmbH
 */

class View : IView {
    val presenter: Presenter = Presenter(this)

    override fun readNewLine(line: String) {
        presenter.addContactFromString(line)
    }

    override fun showContacts() {
        val contacts = presenter.getContacts()
        println("----Agenda----")
        contacts.forEach { println("- ${it.name}: ${it.telephone}") }
    }

    override fun showError(errorMessage: String) {
        println(errorMessage)
    }


}

interface IView {

    fun readNewLine(contact: String)
    fun showContacts()
    fun showError(errorMessage: String)
}