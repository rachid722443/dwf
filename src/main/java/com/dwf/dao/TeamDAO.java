package com.dwf.dao;

import java.util.List;

import com.dwf.model.Team;

public interface TeamDAO {

    public void addTeam(Team team);

    public void updateTeam(Team team);

    public Team getTeam(int id);

    public void deleteTeam(int id);

    public List<Team> getTeams();

}
