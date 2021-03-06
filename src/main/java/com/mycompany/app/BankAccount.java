package com.mycompany.app;


public class BankAccount {
    private String design_url;
    private Integer transactions_total_amount;
    private Integer tariff_avg_month_balance;
    private Integer type;
    private String closing_date;
    private Integer partial_withdraw_available;
    private Integer refill_available;
    private Double blocked_amount;
    private String scheme_id;
    private String pan;
    private Integer account_id;
    private String title_small;
    private String title;
    private Double balance;
    private String currency;
    private Boolean isSalary;

    public BankAccount(){
    }

    public BankAccount(String design_url, Integer transactions_total_amount, Integer tariff_avg_month_balance, Integer type, String closing_date, Integer partial_withdraw_available, Integer refill_available, Double blocked_amount, String scheme_id, String pan, Integer account_id, String title_small, String title, Double balance, String currency, Boolean isSalary) {
        this.design_url = design_url;
        this.transactions_total_amount = transactions_total_amount;
        this.tariff_avg_month_balance = tariff_avg_month_balance;
        this.type = type;
        this.closing_date = closing_date;
        this.partial_withdraw_available = partial_withdraw_available;
        this.refill_available = refill_available;
        this.blocked_amount = blocked_amount;
        this.scheme_id = scheme_id;
        this.pan = pan;
        this.account_id = account_id;
        this.title_small = title_small;
        this.title = title;
        this.balance = balance;
        this.currency = currency;
        this.isSalary = isSalary;
    }

    public String getDesign_url() {
        return design_url;
    }

    public void setDesign_url(String design_url) {
        this.design_url = design_url;
    }

    public Integer getTransactions_total_amount() {
        return transactions_total_amount;
    }

    public void setTransactions_total_amount(Integer transactions_total_amount) {
        this.transactions_total_amount = transactions_total_amount;
    }

    public Integer getTariff_avg_month_balance() {
        return tariff_avg_month_balance;
    }

    public void setTariff_avg_month_balance(Integer tariff_avg_month_balance) {
        this.tariff_avg_month_balance = tariff_avg_month_balance;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getClosing_date() {
        return closing_date;
    }

    public void setClosing_date(String closing_date) {
        this.closing_date = closing_date;
    }

    public Integer getPartial_withdraw_available() {
        return partial_withdraw_available;
    }

    public void setPartial_withdraw_available(Integer partial_withdraw_available) {
        this.partial_withdraw_available = partial_withdraw_available;
    }

    public Integer getRefill_available() {
        return refill_available;
    }

    public void setRefill_available(Integer refill_available) {
        this.refill_available = refill_available;
    }

    public Double getBlocked_amount() {
        return blocked_amount;
    }

    public void setBlocked_amount(Double blocked_amount) {
        this.blocked_amount = blocked_amount;
    }

    public String getScheme_id() {
        return scheme_id;
    }

    public void setScheme_id(String scheme_id) {
        this.scheme_id = scheme_id;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public Integer getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
    }

    public String getTitle_small() {
        return title_small;
    }

    public void setTitle_small(String title_small) {
        this.title_small = title_small;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Boolean getSalary() {
        return isSalary;
    }

    public void setSalary(Boolean salary) {
        isSalary = salary;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "design_url='" + design_url + '\'' +
                ", transactions_total_amount=" + transactions_total_amount +
                ", tariff_avg_month_balance=" + tariff_avg_month_balance +
                ", type=" + type +
                ", closing_date='" + closing_date + '\'' +
                ", partial_withdraw_available=" + partial_withdraw_available +
                ", refill_available=" + refill_available +
                ", blocked_amount=" + blocked_amount +
                ", scheme_id='" + scheme_id + '\'' +
                ", pan='" + pan + '\'' +
                ", account_id=" + account_id +
                ", title_small='" + title_small + '\'' +
                ", title='" + title + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", isSalary=" + isSalary +
                '}';
    }


}
