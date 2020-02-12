package com.example.finalprojesi;

import java.util.List;

public class AdversiteResponse {
    private boolean error;
    private List<Advertise> users;

    public AdversiteResponse(){}

    public AdversiteResponse(boolean error) {
        this.error = error;
        this.users=users;
    }

    public boolean isError() {
        return error;

    }
    public void setError(boolean error){
        this.error=error;
    }


    public List<Advertise> getUsers() {
        return users;
    }
    public void setUsers(List<Advertise> users){
        this.users=users;
    }
}
