package com.remnant.lms.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.remnant.lms.db.entity.Address;
import com.remnant.lms.db.entity.Application;
import com.remnant.lms.db.entity.Client;
import com.remnant.lms.db.entity.ScheduleItem;
import com.remnant.lms.dto.AddressDetails;
import com.remnant.lms.dto.ApplicationDetails;
import com.remnant.lms.dto.ClientDetails;
import com.remnant.lms.dto.RemnantRequest;
import com.remnant.lms.dto.ScheduleDetail;


@Mapper(componentModel = "spring")
public interface LmsMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "client", ignore = true)
    @Mapping(target = "applicationDateTime", ignore = true)
    @Mapping(target = "applicationType", ignore = true)
    @Mapping(target = "account", ignore = true)
    public Application applicationDetailsToApplication(ApplicationDetails applicationDetails);
	
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "client", ignore = true)
    public Address addressDetailsToAddress(AddressDetails addressDetails);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "accounts", ignore = true)
    @Mapping(target = "addresses", ignore = true)
    @Mapping(target = "applications", ignore = true)
    @Mapping(target = "btcAddress", ignore = true)
    @Mapping(target = "subAccountId", ignore = true)
    public Client clientDetailstToClient(ClientDetails clientDetails);

    @Mapping(target = "id", ignore = true)
	public ScheduleItem scheduleDetailToScheduleItem(ScheduleDetail schedule);
	
}
