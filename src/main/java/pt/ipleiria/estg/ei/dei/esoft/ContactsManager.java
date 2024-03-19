package pt.ipleiria.estg.ei.dei.esoft;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ContactsManager {
    private List<Contact> contacts;
    private HashMap<String, List<Contact>> labels;
    public ContactsManager() {
        contacts = new LinkedList<>();
        labels = new HashMap<>(200);
    }
    public List<String> getLabels() {
        return (List<String>) labels.keySet();
    }
    public List<Contact> getContacts(String... labels) {
        if(labels.length == 0){
            return contacts;
        }
        List<Contact> output = new LinkedList<>();
        for(String label : labels){
            if(this.labels.containsKey(label)){
                output.addAll(this.labels.get(label));
            }
        }
        return output;
    }
    public List<Contact> search(String term, String... labels) {
        List<Contact> labeledContacts = getContacts(labels);
        List<Contact> output = new LinkedList<>();
        for(Contact c : labeledContacts){
            if(c.getFirstName().contains(term)||c.getLastName().contains(term)||c.getPhone().contains(term)||c.getEmail().contains(term)){
                output.add(c);
            }
        }
        return output;
    }
    public void addContact(Contact contact, String... labels) {
        // TODO add contact and associate it with the labels, if any
        // DO NOT ALLOW TO ADD DUPLICATED CONTACTS (same phone and/or email)
    }
    public void removeContact(Contact contact) {
        // TODO remove the contact
    }
    public int size() {
        return contacts.size();
    }
}
