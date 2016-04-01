/**
 * Created by hugomatilla on 31/03/16.
 * Property of scondoo GmbH
 */


class Agenda(val repository: IContactRepository ) : IAgenda {

    override fun addContact(contact: Contact) {
        repository.addContact(contact)
    }

    override fun getContacts(): Collection<Contact> {
        return repository.getContacts()
    }

}

interface IAgenda {

    fun addContact(contact: Contact)
    fun getContacts(): Collection<Contact>
}
