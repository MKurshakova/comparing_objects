package com.pjatk.objects;

import java.util.ArrayList;
import java.util.Objects;

public class Address {
    private int idAddress;
    private String city;
    private String postalCode;
    private ArrayList<String> addressLines = new ArrayList<String>();

    public Address(int idAddress, String city, String postalCode) {
        this.idAddress = idAddress;
        this.city = city;
        this.postalCode = postalCode;
    }

    public int getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(int idAddress) {
        this.idAddress = idAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public ArrayList<String> getAddressLines() {
        return addressLines;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAddress, city, postalCode, addressLines);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Address address = (Address) obj;
        return idAddress == address.idAddress &&
                Objects.equals(city, address.city) &&
                Objects.equals(postalCode, address.postalCode) &&
                Objects.equals(addressLines, address.addressLines);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(idAddress).append(", ").append(city).append(", ").append(postalCode);
        sb.append(", {");
        for (int i = 0; i < addressLines.size(); i++) {
            sb.append(addressLines.get(i));
            if (i != addressLines.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("})");
        return sb.toString();
    }
}
