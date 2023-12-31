package com.kenzie.inmemorycaching.kenziegaming.activity;

import com.kenzie.inmemorycaching.kenziegaming.dao.GroupDao;
import com.kenzie.inmemorycaching.kenziegaming.dao.models.Group;
import com.kenzie.inmemorycaching.kenziegaming.dao.models.GroupType;

import javax.inject.Inject;

/**
 * Handles requests to create a group.
 */
public class CreateGroupActivity {

    private final GroupDao groupDao;

    /**
     * Constructs an Activity with the given DAOs.
     * @param groupDao The GroupDao to create the group
     */
    @Inject
    public CreateGroupActivity(final GroupDao groupDao) {
        this.groupDao = groupDao;
    }

    /**
     * Creates a group with the provided name and type.
     * @param groupName the name of the group
     * @param groupType the type of the group to create
     * @return the newly created group
     */
    public Group handleRequest(final String groupName, final GroupType groupType) {
        return groupDao.createGroup(groupName, groupType);
    }
}
