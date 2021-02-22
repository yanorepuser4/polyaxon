// Copyright 2018-2021 Polyaxon, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/*
 * Polyaxon SDKs and REST API specification.
 * Polyaxon SDKs and REST API specification.
 *
 * The version of the OpenAPI document: 1.6.0
 * Contact: contact@polyaxon.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.threeten.bp.OffsetDateTime;
import org.openapitools.client.model.RuntimeError;
import org.openapitools.client.model.V1ListActivitiesResponse;
import org.openapitools.client.model.V1ListOrganizationMembersResponse;
import org.openapitools.client.model.V1ListOrganizationsResponse;
import org.openapitools.client.model.V1Organization;
import org.openapitools.client.model.V1OrganizationMember;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrganizationsV1Api
 */
@Ignore
public class OrganizationsV1ApiTest {

    private final OrganizationsV1Api api = new OrganizationsV1Api();

    
    /**
     * Create organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrganizationTest() throws ApiException {
        V1Organization body = null;
        V1Organization response = api.createOrganization(body);

        // TODO: test validations
    }
    
    /**
     * Create organization member
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrganizationMemberTest() throws ApiException {
        String owner = null;
        V1OrganizationMember body = null;
        String email = null;
        V1OrganizationMember response = api.createOrganizationMember(owner, body, email);

        // TODO: test validations
    }
    
    /**
     * Delete organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrganizationTest() throws ApiException {
        String owner = null;
        String usage = null;
        api.deleteOrganization(owner, usage);

        // TODO: test validations
    }
    
    /**
     * Delete organization invitation details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrganizationInvitationTest() throws ApiException {
        String owner = null;
        String memberUser = null;
        String memberUserEmail = null;
        String memberRole = null;
        OffsetDateTime memberCreatedAt = null;
        OffsetDateTime memberUpdatedAt = null;
        String email = null;
        api.deleteOrganizationInvitation(owner, memberUser, memberUserEmail, memberRole, memberCreatedAt, memberUpdatedAt, email);

        // TODO: test validations
    }
    
    /**
     * Delete organization member details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteOrganizationMemberTest() throws ApiException {
        String owner = null;
        String name = null;
        api.deleteOrganizationMember(owner, name);

        // TODO: test validations
    }
    
    /**
     * Get organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationTest() throws ApiException {
        String owner = null;
        String usage = null;
        V1Organization response = api.getOrganization(owner, usage);

        // TODO: test validations
    }
    
    /**
     * Get organization activities
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationActivitiesTest() throws ApiException {
        String owner = null;
        Integer offset = null;
        Integer limit = null;
        String sort = null;
        String query = null;
        V1ListActivitiesResponse response = api.getOrganizationActivities(owner, offset, limit, sort, query);

        // TODO: test validations
    }
    
    /**
     * Get organization invitation details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationInvitationTest() throws ApiException {
        String owner = null;
        String memberUser = null;
        String memberUserEmail = null;
        String memberRole = null;
        OffsetDateTime memberCreatedAt = null;
        OffsetDateTime memberUpdatedAt = null;
        String email = null;
        V1OrganizationMember response = api.getOrganizationInvitation(owner, memberUser, memberUserEmail, memberRole, memberCreatedAt, memberUpdatedAt, email);

        // TODO: test validations
    }
    
    /**
     * Get organization member details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationMemberTest() throws ApiException {
        String owner = null;
        String name = null;
        V1OrganizationMember response = api.getOrganizationMember(owner, name);

        // TODO: test validations
    }
    
    /**
     * Get organization settings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationSettingsTest() throws ApiException {
        String owner = null;
        String organizationUser = null;
        String organizationUserEmail = null;
        String organizationName = null;
        Boolean organizationIsPublic = null;
        OffsetDateTime organizationCreatedAt = null;
        OffsetDateTime organizationUpdatedAt = null;
        String organizationRole = null;
        String organizationQueue = null;
        String organizationPreset = null;
        V1Organization response = api.getOrganizationSettings(owner, organizationUser, organizationUserEmail, organizationName, organizationIsPublic, organizationCreatedAt, organizationUpdatedAt, organizationRole, organizationQueue, organizationPreset);

        // TODO: test validations
    }
    
    /**
     * Get organization stats
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getOrganizationStatsTest() throws ApiException {
        String owner = null;
        Integer offset = null;
        Integer limit = null;
        String sort = null;
        String query = null;
        String kind = null;
        String aggregate = null;
        String groupby = null;
        String trunc = null;
        Object response = api.getOrganizationStats(owner, offset, limit, sort, query, kind, aggregate, groupby, trunc);

        // TODO: test validations
    }
    
    /**
     * Get organization member names
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOrganizationMemberNamesTest() throws ApiException {
        String owner = null;
        Integer offset = null;
        Integer limit = null;
        String sort = null;
        String query = null;
        V1ListOrganizationMembersResponse response = api.listOrganizationMemberNames(owner, offset, limit, sort, query);

        // TODO: test validations
    }
    
    /**
     * Get organization members
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOrganizationMembersTest() throws ApiException {
        String owner = null;
        Integer offset = null;
        Integer limit = null;
        String sort = null;
        String query = null;
        V1ListOrganizationMembersResponse response = api.listOrganizationMembers(owner, offset, limit, sort, query);

        // TODO: test validations
    }
    
    /**
     * List organizations names
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOrganizationNamesTest() throws ApiException {
        V1ListOrganizationsResponse response = api.listOrganizationNames();

        // TODO: test validations
    }
    
    /**
     * List organizations
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listOrganizationsTest() throws ApiException {
        V1ListOrganizationsResponse response = api.listOrganizations();

        // TODO: test validations
    }
    
    /**
     * Organization plan
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void organizationPlanTest() throws ApiException {
        String owner = null;
        V1Organization body = null;
        V1Organization response = api.organizationPlan(owner, body);

        // TODO: test validations
    }
    
    /**
     * Patch organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchOrganizationTest() throws ApiException {
        String owner = null;
        V1Organization body = null;
        V1Organization response = api.patchOrganization(owner, body);

        // TODO: test validations
    }
    
    /**
     * Patch organization invitation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchOrganizationInvitationTest() throws ApiException {
        String owner = null;
        V1OrganizationMember body = null;
        String email = null;
        V1OrganizationMember response = api.patchOrganizationInvitation(owner, body, email);

        // TODO: test validations
    }
    
    /**
     * Patch organization member
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchOrganizationMemberTest() throws ApiException {
        String owner = null;
        String memberUser = null;
        V1OrganizationMember body = null;
        String email = null;
        V1OrganizationMember response = api.patchOrganizationMember(owner, memberUser, body, email);

        // TODO: test validations
    }
    
    /**
     * Patch oranization settings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchOrganizationSettingsTest() throws ApiException {
        String owner = null;
        V1Organization body = null;
        V1Organization response = api.patchOrganizationSettings(owner, body);

        // TODO: test validations
    }
    
    /**
     * Update organization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrganizationTest() throws ApiException {
        String owner = null;
        V1Organization body = null;
        V1Organization response = api.updateOrganization(owner, body);

        // TODO: test validations
    }
    
    /**
     * Update organization invitation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrganizationInvitationTest() throws ApiException {
        String owner = null;
        V1OrganizationMember body = null;
        String email = null;
        V1OrganizationMember response = api.updateOrganizationInvitation(owner, body, email);

        // TODO: test validations
    }
    
    /**
     * Update organization member
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrganizationMemberTest() throws ApiException {
        String owner = null;
        String memberUser = null;
        V1OrganizationMember body = null;
        String email = null;
        V1OrganizationMember response = api.updateOrganizationMember(owner, memberUser, body, email);

        // TODO: test validations
    }
    
    /**
     * Update organization settings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateOrganizationSettingsTest() throws ApiException {
        String owner = null;
        V1Organization body = null;
        V1Organization response = api.updateOrganizationSettings(owner, body);

        // TODO: test validations
    }
    
}
