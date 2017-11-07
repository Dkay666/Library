package kz.inessoft.project.entity.impl;

import kz.inessoft.project.consatnts.Constants;
import kz.inessoft.project.entity.Publication;

import static kz.inessoft.project.consatnts.Constants.*;


/**
 * This class implements abstract operands from abstract class publication
 * and adds operands of its own entity
 * @author Artyom Revinov
 */
public class Booklet extends Publication {
    private String month;

    @Override
    public String getType() {

        return Constants.BOOKLET;
    }

    @Override
    public String getAllInfo() {

        return String.format(FORMAT_BOOKLET_BODY,getId(),
                getName(),getMonth()+getYear(),getPublisher(),getDescription());
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }



    @Override
    public String toString() {
        return String.format(FORMAT_REGISTERED_PUB_BODY, getId(), getType(), getName(), getMonth() + getYear(), EMPTY, getPublisher());

    }
}
