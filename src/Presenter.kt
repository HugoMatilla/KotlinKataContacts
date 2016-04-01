/**
 * Created by hugomatilla on 31/03/16.
 */


class Presenter(val view: IView) : IPresenter {

    val repository: IContactRepository = ContactRepository()
    val agenda = Agenda(repository)
    val addContactFromString = AddContact(agenda)
    val getContacts = GetContact(agenda)

    override fun addContactFromString(line: String) {
        val contact = getContactFromString(line)
        if (contact != null)
            addContactFromString.execute(contact)
    }

    override fun getContacts(): Collection<Contact> {
        return getContacts.execute()
    }

    private fun getContactFromString(input: String): Contact? {
        val inputSplit = input.split(" ")
        try {
            if (inputSplit.size != 2)
                throw IndexOutOfBoundsException()
            val name = inputSplit[0]
            val telephone = inputSplit[1]
            return Contact(name, telephone)
        } catch (e: IndexOutOfBoundsException) {
            view.showError("Error: Malformed Contact \nRequired format: <Name> <Telephone>")
            return null
        }
    }


}

interface IPresenter {

    fun addContactFromString(line: String)
    fun getContacts(): Collection<Contact>
}