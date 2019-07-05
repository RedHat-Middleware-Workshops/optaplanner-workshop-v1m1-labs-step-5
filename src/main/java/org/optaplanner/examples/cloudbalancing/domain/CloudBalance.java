package org.optaplanner.examples.cloudbalancing.domain;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import org.optaplanner.core.api.domain.solution.PlanningSolution;

@PlanningSolution
@XStreamAlias("CloudBalance")
public class CloudBalance extends AbstractPersistable {
    
    private List<CloudComputer> computerList;
    
    private List<CloudProcess> processList;
    
    public CloudBalance() {
    }

    public CloudBalance(Long id, List<CloudComputer> computerList, List<CloudProcess> processList) {
		super(id);
        this.computerList = computerList;
        this.processList = processList;
    }

	/**
	 * @return the computerList
	 */
	public List<CloudComputer> getComputerList() {
		return computerList;
	}

	/**
	 * @param computerList the computerList to set
	 */
	public void setComputerList(List<CloudComputer> computerList) {
		this.computerList = computerList;
	}

	/**
	 * @return the processList
	 */
	public List<CloudProcess> getProcessList() {
		return processList;
	}

	/**
	 * @param processList the processList to set
	 */
	public void setProcessList(List<CloudProcess> processList) {
		this.processList = processList;
	}
    
    
}
