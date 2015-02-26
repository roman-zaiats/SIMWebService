package com.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


@Entity
@Table(name = "Request")
public class Request {

    public static enum STATUS {
        STOP, PREPARE, WAIT_NUMBER,
        NUMBER_SUBMIT,
        WAIT_CODE,
        COMPLETED,
        NUMBER_REJECT
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "propose_id")
    private Propose propose;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private STATUS status;

    @Column(name = "number")
    private long number;

    @Column(name = "code")
    private String code;


    @Column(name = "started")
    private Date started;

    @Column(name = "finished")
    private Date finished;

    @Column(name = "expired")
    private boolean expired;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Transaction> transaction;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Propose getPropose() {
        return propose;
    }

    public void setPropose(Propose propose) {
        this.propose = propose;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getStarted() {
        return started;
    }

    public void setStarted(Date started) {
        this.started = started;
    }

    public Date getFinished() {
        return finished;
    }

    public void setFinished(Date finished) {
        this.finished = finished;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }

    public void addTransaction(Transaction transaction1) {
        if (this.transaction == null) {
            transaction = new LinkedList<>();
        }
        this.transaction.add(transaction1);
    }
}
