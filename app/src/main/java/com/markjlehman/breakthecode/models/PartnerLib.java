package com.markjlehman.breakthecode.models;

import com.markjlehman.breakthecode.R;

import java.util.ArrayList;

public class PartnerLib {
    private ArrayList<Partner> mPartners;

    public PartnerLib() {
        setNonProfitPartners();
    }

    public ArrayList<Partner> getPartners() {
        return mPartners;
    }

    public void setNonProfitPartners() {
        mPartners = new ArrayList<Partner>();

        mPartners.add(new Partner(
                "App Camp for Girls",
                "App Camp For Girls is a place where girls can put their creative powers to work, designing and building apps, while learning more about the business of software and being inspired by women mentors in the field. ",
                "http://appcamp4girls.com/",
                R.drawable.app_camp_for_girls
        ));

        mPartners.add(new Partner(
                "ChickTech",
                "ChickTech is dedicated to retaining women in the technology workforce and increasing the number of women and girls pursuing technology-based careers",
                "http://chicktech.org/",
                R.drawable.chicktech
        ));

        mPartners.add(new Partner(
                "Girl Develop It",
                "Girl Develop It is a nonprofit organization that provides affordable programs for adult women interested in learning web and software development in a judgment-free environment.",
                "https://www.girldevelopit.com/",
                R.drawable.girl_develop_it
        ));
    }

    public Partner nextPartner(Partner currentPartner) {
        int index = mPartners.indexOf(currentPartner);
        if (index == mPartners.size() - 1) {
            return mPartners.get(0);
        } else {
            return mPartners.get(index + 1);
        }
    }

}
