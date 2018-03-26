package com.tqdev.crudapi.core;

import com.tqdev.crudapi.core.record.DatabaseRecords;
import com.tqdev.crudapi.core.record.DatabaseRecordsException;
import com.tqdev.crudapi.core.record.ListResponse;
import com.tqdev.crudapi.core.record.Record;
import com.tqdev.crudapi.meta.definition.DatabaseDefinitionException;

import java.io.IOException;

public interface CrudApiService {

	// crud

	boolean exists(String table);

	String create(String table, Record record, Params params);

	Record read(String table, String id, Params params);

	int update(String table, String id, Record record, Params params);

	int increment(String table, String id, Record record, Params params);

	int delete(String table, String id, Params params);

	ListResponse list(String table, Params params);

	// meta

	void update();

	DatabaseRecords getDatabaseRecords();

	// initialization

	void initialize(String recordsFilename) throws IOException,
			DatabaseDefinitionException, DatabaseRecordsException;

}
