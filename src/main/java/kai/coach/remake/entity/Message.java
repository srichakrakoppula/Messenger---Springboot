package kai.coach.remake.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "MESSAGES")
public class Message {
    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "BODY")
    private String body;

    @Column(name = "IS_GENERATED")
    private Character isGenerated;

    @Column(name = "IS_INCOMING")
    private Character isIncoming;

    @Column(name = "CUSTOMER_REF")
    private String customerRef;

    @Column(name = "AGENT_REF")
    private String agentRef;

    @Column(name="CREATED_AT")
    private LocalDate createdAt;

    @Column(name="CREATED_BY")
    private LocalDate createdBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Character getIsGenerated() {
        return isGenerated;
    }

    public void setIsGenerated(Character isGenerated) {
        this.isGenerated = isGenerated;
    }

    public Character getIsIncoming() {
        return isIncoming;
    }

    public void setIsIncoming(Character isIncoming) {
        this.isIncoming = isIncoming;
    }

    public String getCustomerRef() {
        return customerRef;
    }

    public void setCustomerRef(String customerRef) {
        this.customerRef = customerRef;
    }

    public String getAgentRef() {
        return agentRef;
    }

    public void setAgentRef(String agentRef) {
        this.agentRef = agentRef;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(LocalDate createdBy) {
        this.createdBy = createdBy;
    }
}
