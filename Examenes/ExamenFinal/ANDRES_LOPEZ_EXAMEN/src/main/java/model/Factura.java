package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Factura implements Serializable {
    int invoice;
    String _id,company,email,phone,address,country,date;
    ArrayList<String> elementos;

    public Factura(int invoice, String _id, String company, String email, String phone, String address, String country, String date, ArrayList<String> elementos) {
        this.invoice = invoice;
        this._id = _id;
        this.company = company;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.country = country;
        this.date = date;
        this.elementos = elementos;
    }

    public Factura(int invoice, String _id, String company, String phone, String country) {
        this.invoice = invoice;
        this._id = _id;
        this.company = company;
        this.phone = phone;
        this.country = country;
    }

    public Factura() {
    }

    public int getInvoice() {
        return invoice;
    }

    public void setInvoice(int invoice) {
        this.invoice = invoice;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<String> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<String> elementos) {
        this.elementos = elementos;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "invoice=" + invoice +
                ", _id='" + _id + '\'' +
                ", company='" + company + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", date='" + date + '\'' +
                ", elementos=" + elementos +
                '}';
    }
}
