package equals;

import java.util.Objects;

public class Programmer {
    private String name;
    private String company;
    private long passportSN;

    public Programmer(String name, String company, long passportSN) {
        this.name = name;
        this.company = company;
        this.passportSN = passportSN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public long getPassportSN() {
        return passportSN;
    }

    public void setPassportSN(long passportSN) {
        this.passportSN = passportSN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programmer that = (Programmer) o;
        return passportSN == that.passportSN &&
                name.equals(that.name) &&
                company.equals(that.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportSN);
    }
}
