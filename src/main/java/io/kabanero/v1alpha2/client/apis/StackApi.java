package io.kabanero.v1alpha2.client.apis;

import java.lang.reflect.Type;

import com.google.gson.reflect.TypeToken;

import io.kabanero.v1alpha2.models.Stack;
import io.kabanero.v1alpha2.models.StackList;
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.ApiResponse;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CustomObjectsApi;
import io.kubernetes.client.models.V1DeleteOptions;

public class StackApi {

	/** The Kubernetes group for Kabanero */
	public static final String GROUP = "kabanero.io";

	/** The Kubernetes version for Kabanero */
	public static final String VERSION = "v1alpha2";

	/** The plural form of the "kind: Stack" */
	public static final String PLURAL = "stacks";
	
	/** The Kind that Kubernetes uses to recognize this object. */
	public static final String STACK_KIND = "Stack";
	
    private ApiClient apiClient;

    /**
     * Constructor that uses the default Kubernetes client.
     */
    public StackApi() {
    	this(Configuration.getDefaultApiClient());
    }

    /**
     * Constructor that uses a specific Kubernetes client.
     * @param apiClient The Kubernetes java client.
     */
    public StackApi(ApiClient apiClient) {
    	this.apiClient = apiClient;
    }

    /**
     * Retrieves the Kubernetes java client instance that this api will use.
     * @return The Kubernetes java client instance.
     */
    public ApiClient getApiClient() {
    	return apiClient;
    }

    /**
     * Sets the Kubernetes java client instance that this api will use.
     * @param apiClient The Kubernetes java client instance.
     */
    public void setApiClient(ApiClient apiClient) {
    	this.apiClient = apiClient;
    }

    /**
     * Creates an instance of "kind: Stack".
     * @param namespace The namespace to create the object in.
     * @param instance The object instance.
     * @return The object instance as returned by the Kubernetes API server in response to the create call.
     * @throws ApiException Thrown if an error occurred while communicating with the Kubernetes API server.
     */
    public Stack createStack(String namespace, Stack instance) throws ApiException {
    	if (namespace == null) {
    		throw new IllegalArgumentException("namespace must not be null");
    	}
    	
    	if (instance == null) {
    		throw new IllegalArgumentException("instance must not be null");
    	}
    	
    	instance.apiVersion(GROUP + "/" + VERSION).kind(STACK_KIND);
    	
        CustomObjectsApi customApi = new CustomObjectsApi(apiClient);
        com.squareup.okhttp.Call call = customApi.createNamespacedCustomObjectCall(GROUP, VERSION, namespace, PLURAL, instance, "false", null, null);
    	Type localVarReturnType = new TypeToken<Stack>(){}.getType();
    	ApiResponse<Stack> resp = apiClient.execute(call, localVarReturnType);
    	return resp.getData();
    }
    
    /**
     * Retrieves an instance of "kind: Stack".
     * @param namespace The namespace to create the object in.
     * @param name The name of the object instance to retrieve.
     * @return The object instance as returned by the Kubernetes API server in response to the get call.
     * @throws ApiException Thrown if an error occurred while communicating with the Kubernetes API server.
     */
    public Stack getStack(String namespace, String name) throws ApiException {
    	if (namespace == null) {
    		throw new IllegalArgumentException("namespace must not be null");
    	}
    	
    	if (name == null) {
    		throw new IllegalArgumentException("name must not be null");
    	}
    	
        CustomObjectsApi customApi = new CustomObjectsApi(apiClient);
    	com.squareup.okhttp.Call call = customApi.getNamespacedCustomObjectCall(GROUP, VERSION, namespace, PLURAL, name, null, null);
    	Type localVarReturnType = new TypeToken<Stack>(){}.getType();
    	ApiResponse<Stack> resp = apiClient.execute(call, localVarReturnType);
    	return resp.getData();
    }
    
    /**
     * Deletes an instance of "kind: Stack".
     * @param namespace The namespace to delete the object from
     * @param name The name of the object to delete
     * @param body The delete options as specified by the Kubernetes java client.
     * @return The object that was deleted, as returned by the Kubernetes API server.
     * @throws ApiException Thrown if an error occurred while communicating with the Kubernetes API server.
     */
    public Stack deleteStack(String namespace, String name, V1DeleteOptions body, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) throws ApiException {
    	if (namespace == null) {
    		throw new IllegalArgumentException("namespace must not be null");
    	}
    	if (name == null) {
    		throw new IllegalArgumentException("name must not be null");
    	}
    	V1DeleteOptions deleteOptions = (body == null) ? new V1DeleteOptions() : body;
    	
    	CustomObjectsApi customApi = new CustomObjectsApi(apiClient);
    	com.squareup.okhttp.Call call = customApi.deleteNamespacedCustomObjectCall(GROUP, VERSION, namespace, PLURAL, name, deleteOptions, gracePeriodSeconds, orphanDependents, propagationPolicy, null, null);
    	Type localVarReturnType = new TypeToken<Stack>() {}.getType();
    	ApiResponse<Stack> resp = apiClient.execute(call, localVarReturnType);
    	return resp.getData();
    }
    
    /**
     * Retrieves a list of "kind: Stack" objects.
     * @param namespace The namespace where the instances should be read from.
     * @param labelSelector An optional label selector to pass to the Kubernetes API server.
     * @return A list of "kind: Stack" objects.
     * @throws ApiException Thrown if an error occurred while communicating with the Kubernetes API server.
     */
    public StackList listStacks(String namespace, String labelSelector, String resourceVersion, Integer timeoutSeconds) throws ApiException {
    	if (namespace == null) {
    		throw new IllegalArgumentException("namespace must not be null");
    	}
    	
    	CustomObjectsApi customApi = new CustomObjectsApi(apiClient);
        com.squareup.okhttp.Call call = customApi.listNamespacedCustomObjectCall(GROUP, VERSION, namespace, PLURAL, "false", labelSelector, resourceVersion, timeoutSeconds, false, null, null);
    	Type localVarReturnType = new TypeToken<StackList>(){}.getType();
        ApiResponse<StackList> resp = apiClient.execute(call, localVarReturnType);
        return resp.getData();
    }
    
    /**
     * Updates an instance of "kind: Stack".
     * @param namespace The namespace to update the object in.
     * @param name The name of the object to update.
     * @param instance The object instance to replace with.
     * @return The object instance as returned by the Kubernetes API server in response to the update call.
     * @throws ApiException Thrown if an error occurred while communicating with the Kubernetes API server.
     */
    public Stack updateStack(String namespace, String name, Stack instance) throws ApiException {
    	if (namespace == null) {
    		throw new IllegalArgumentException("namespace must not be null");
    	}
    	if (name == null) {
    		throw new IllegalArgumentException("name must not be null");
    	}
    	if (instance == null) {
    		throw new IllegalArgumentException("instance must not be null");
    	}
    	
    	instance.apiVersion(GROUP + "/" + VERSION).kind(STACK_KIND);

    	CustomObjectsApi customApi = new CustomObjectsApi(apiClient);
        com.squareup.okhttp.Call call = customApi.replaceNamespacedCustomObjectCall(GROUP, VERSION, namespace, PLURAL, name, instance, null, null);
    	Type localVarReturnType = new TypeToken<Stack>(){}.getType();
    	ApiResponse<Stack> resp = apiClient.execute(call, localVarReturnType);
    	return resp.getData();
    }
    
    /**
     * Patches an instance of "kind: Stack".
     * @param namespace The namespace to update the object in.
     * @param name The name of the object to update.
     * @param instance The object instance to patch.
     * @return The object instance as returned by the Kubernetes API server in response to the patch call.
     * @throws ApiException Thrown if an error occurred while communicating with the Kubernetes API server.
     */
    public Stack patchStack(String namespace, String name, Stack instance) throws ApiException {
    	if (namespace == null) {
    		throw new IllegalArgumentException("namespace must not be null");
    	}
    	if (name == null) {
    		throw new IllegalArgumentException("name must not be null");
    	}
    	if (instance == null) {
    		throw new IllegalArgumentException("instance must not be null");
    	}
    	
    	instance.apiVersion(GROUP + "/" + VERSION).kind(STACK_KIND);

    	CustomObjectsApi customApi = new CustomObjectsApi(apiClient);
    	com.squareup.okhttp.Call call = customApi.patchNamespacedCustomObjectCall(GROUP, VERSION, namespace, PLURAL, name, instance, null, null);
    	Type localVarReturnType = new TypeToken<Stack>() {}.getType();
    	ApiResponse<Stack> resp = apiClient.execute(call, localVarReturnType);
    	return resp.getData();
    }

}
