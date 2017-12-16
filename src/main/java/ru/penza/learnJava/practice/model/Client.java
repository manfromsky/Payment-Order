package ru.penza.learnJava.practice.model;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mihail on 16.12.2017.
 */
@Entity
@Table(name = "client")

public class Client {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id")
    private Long id;

    /**
     * Наименование организации
     */

    @Basic(optional = false)
    @Column
    private String name;

    /**
     * Счет организации
     */

    @Basic(optional = false)
    @Column(name = "account")
    private BigInteger account;

    /**
     * ИНН Организации
     */

    @Column(name = "inn")
    private Long inn;

    /**
     * КПП Организации
     */

    @Column(name = "kpp")
    private Integer kpp;

    /**
     * Служебное поле hibernate
     */

    @Version
    private Integer version;

    /**
     * Банк организации
     */

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;

    /**
     * Перечень платежных поручений, где организация - плательщик
     */

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "payer")
    private Set<PaymentOrder> payerOrder = new HashSet<PaymentOrder>();

    /**
     * Перечень платежных поручений, где организация - получатель
     */

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "recipient")
    private Set<PaymentOrder> recipientOrder = new HashSet<PaymentOrder>();


    public Client() {
    }

    public Client(String name, BigInteger account, Long inn, Integer kpp) {
        this.name = name;
        this.account = account;
        this.inn = inn;
        this.kpp = kpp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getAccount() {
        return account;
    }

    public void setAccount(BigInteger account) {
        this.account = account;
    }

    public Long getInn() {
        return inn;
    }

    public void setInn(Long inn) {
        this.inn = inn;
    }

    public Integer getKpp() {
        return kpp;
    }

    public void setKpp(Integer kpp) {
        this.kpp = kpp;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Set<PaymentOrder> getPayerOrder() {
        return payerOrder;
    }

    public void setPayerOrder(Set<PaymentOrder> payerOrder) {
        this.payerOrder = payerOrder;
    }

    public Set<PaymentOrder> getRecipientOrder() {
        return recipientOrder;
    }

    public void setRecipientOrder(Set<PaymentOrder> recipientOrder) {
        this.recipientOrder = recipientOrder;
    }
}
