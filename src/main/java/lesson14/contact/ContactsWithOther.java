package lesson14.contact;

import java.util.Collection;
import java.util.HashSet;

public class ContactsWithOther extends Contact{

    private Collection<Contact> linkedContacts;


    public ContactsWithOther() {
        this.linkedContacts = new HashSet<>();
    }

    public Collection<Contact> getLinkedContacts() {
        return linkedContacts;
    }

}
