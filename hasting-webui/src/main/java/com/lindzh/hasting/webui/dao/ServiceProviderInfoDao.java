package com.lindzh.hasting.webui.dao;

import com.lindzh.hasting.webui.pojo.ServiceProviderInfo;
import org.apache.ibatis.annotations.Param;

/**
 * @author AutoGenerated by lindzh
 * 2016年12月15日 16:55
 */
public interface ServiceProviderInfoDao {

	public int addServiceProviderInfo(ServiceProviderInfo obj);

	public ServiceProviderInfo getById(@Param("id")long id);
	
	public int updateById(@Param("obj")ServiceProviderInfo obj);
	
	public int deleteById(@Param("id")long id);



	public int deleteByAppIdAndHostId(@Param("appId") long appId,@Param("hostId") long hostId);

	public ServiceProviderInfo getByAppHostAndServiceId(@Param("appId")long appId,@Param("hostId")long hostId,@Param("serviceId")long serviceId);

	public int getServiceProviderCount(@Param("appId")long appId,@Param("serviceId") long ServiceId);
	
}