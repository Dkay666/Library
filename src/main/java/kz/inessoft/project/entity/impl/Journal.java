package kz.inessoft.project.entity.impl;

import kz.inessoft.project.consatnts.Constants;
import kz.inessoft.project.entity.Publication;

import static kz.inessoft.project.consatnts.Constants.*;

/**
 * This class implements abstract operands from abstract class publication
 * and adds operands of its own entity
 * @author Artyom Revinov.
 */
public class Journal extends Publication {
    private String month;
    private int countPage;


    @Override
    public String getType() {

        return Constants.JOURNAL;
    }

    public String getAllInfo() {

        return String.format(FORMAT_MAGAZINE_BODY,getId(),
                getName(),getMonth()+getYear(),getCountPage(),getPublisher(),getDescription());
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    @Override
    public String toString() {
        return String.format(FORMAT_REGISTERED_PUB_BODY, getId(), getType(), getName(), getMonth() + getYear(), getCountPage(), getPublisher());
    }
}
