import java.util.*

/**
 * Created by hugomatilla on 31/03/16.
 * Property of scondoo GmbH
 */


class ContactRepository() : IContactRepository {

    var contactsList: MutableList<Contact> = ArrayList()

    override fun addContact(contact: Contact) {
        contactsList.add(contact)
    }

    override fun getContacts(): Collection<Contact> {
        return contactsList as MutableList<Contact>
    }
}

interface IContactRepository {
    fun addContact(contact: Contact)
    fun getContacts(): Collection<Contact>
}
