/*
 * Copyright 2015 Jean-Jacques Dubray jdubray@xgen.io
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 *////////////////////////////////////////////////////////////////////////////

package xgen.io.star.core.connectors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Connector {
		
		public Connector connect(HashMap<String,String> connOptions) throws DatabaseException ;
	    
	    public void putItem(Options params) throws DatabaseException;
	    
	    public void updateItem(Options params) throws DatabaseException;

	    public void deleteItem(Options params) throws DatabaseException;
	    
	    public Map<String,Object> getItem(Options params) throws DatabaseException;
	    
	    public List<Map<String,Object>> query(Options params) throws DatabaseException;
	    
	    public List<Map<String,Object>> scan(Options params) throws DatabaseException;
	
	    public void close() throws DatabaseException ;
}
