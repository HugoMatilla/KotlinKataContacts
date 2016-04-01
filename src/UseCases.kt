/**
 * Created by hugomatilla on 31/03/16.
 * Property of scondoo GmbH
 */


class AddContact(val agenda: Agenda) : IAddContactUseCase {
    override fun execute(contact: Contact) {
        agenda.addContact(contact)
    }
}

interface IAddContactUseCase {
    fun execute(contact: Contact)
}

class GetContact(val agenda: Agenda) : IGetContactUseCase {
    override fun execute(): Collection<Contact> {
        return agenda.getContacts()
    }
}

interface IGetContactUseCase {
    fun execute(): Collection<Contact>
}