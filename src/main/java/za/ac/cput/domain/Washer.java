package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Washer extends User {

    @Id
    private String userId;   // String primary key
    private String name;
    private String email;
    private long cellPhone;  // long for numeric phone numbers

    // Default constructor
    protected Washer() {}

    private Washer(Builder builder) {
        this.userId = builder.userId;
        this.name = builder.name;
        this.email = builder.email;
        this.cellPhone = builder.cellPhone;
    }

    // Getters
    public String getUserId() { return userId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public long getCellPhone() { return cellPhone; }

    // Builder class
    public static class Builder {
        private String userId;
        private String name;
        private String email;
        private long cellPhone;

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setCellPhone(long cellPhone) {
            this.cellPhone = cellPhone;
            return this;
        }

        public Builder copy(Washer washer) {
            this.userId = washer.userId;
            this.name = washer.name;
            this.email = washer.email;
            this.cellPhone = washer.cellPhone;
            return this;
        }

        public Washer build() {
            return new Washer(this);
        }
    }
}
