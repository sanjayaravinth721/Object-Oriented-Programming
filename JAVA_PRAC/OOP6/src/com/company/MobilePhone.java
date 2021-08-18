package com.company;

import java.util.ArrayList;


public class MobilePhone {
    private String MyNumber;
    private  ArrayList<Contact> MyContact;

    public MobilePhone(String MyNumber){
        this.MyNumber=MyNumber;
        this.MyContact= new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0){
            System.out.println("Already Exists");
            return false;
        }
        MyContact.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact,Contact newContact){
        int foundPosition=findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        } else if (this.findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() + " already exists.  Update was not successful.");
            return false;
        } else {
            this.MyContact.set(foundPosition, newContact);
            System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
            return true;
        }
    }

    public boolean removeContact(Contact removeContact){
        int foundPos=findContact(removeContact);
        if(foundPos<0) {
            System.out.println("Not found and cant be removed");
            return false;
        }
        this.MyContact.remove(foundPos);
        System.out.println(removeContact.getName()+" is removed");
        return true;

    }
    private int findContact(Contact find){
        return this.MyContact.indexOf(find); //contact==find return the contact
    }

    public int findContact(String find){

            for(int i=0;i<this.MyContact.size();i++){
                if(this.MyContact.get(i).getName().equals(find)){
                    System.out.println(find +" is found");
                    return i;
                }
            }
          return -1;
    }




    public  String queryContact(Contact query){
        if(findContact(query)>=0){
            return query.getName();
        }
        return null;
    }

    public Contact queryContact(String query){
        int position = this.findContact(query);
        return position >= 0 ? (Contact)this.MyContact.get(position) : null;
    }

    public void printContacts(){
        System.out.println("Contact List:");

        for(int i=0;i<this.MyContact.size();i++){
            System.out.println((i+1)+". "+MyContact.get(i).getName()+" -> "+MyContact.get(i).getPhoneNumber());

        }
    }



}
