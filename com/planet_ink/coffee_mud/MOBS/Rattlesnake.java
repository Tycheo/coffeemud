package com.planet_ink.coffee_mud.MOBS;

import java.util.*;
import com.planet_ink.coffee_mud.utils.*;
import com.planet_ink.coffee_mud.interfaces.*;
import com.planet_ink.coffee_mud.common.*;
public class Rattlesnake extends StdMOB
{

	public Rattlesnake()
	{
		super();
		Username="a rattlesnake";
		setDescription("A fearsome creature with long fangs and an effective warning for the unwary.");
		setDisplayText("A rattlesnake shakes his tale at you furiously");
		setAlignment(500);
		setMoney(0);

		addBehavior(CMClass.getBehavior("CombatAbilities"));
		addAbility(CMClass.getAbility("Poison"));

		baseEnvStats().setDamage(4);

		baseCharStats().setStat(CharStats.INTELLIGENCE,1);

		baseEnvStats().setAbility(0);
		baseEnvStats().setLevel(2);
		baseEnvStats().setArmor(10);

		baseCharStats().setMyRace(CMClass.getRace("Snake"));
		baseCharStats().getMyRace().startRacing(this,false);
		baseState.setHitPoints(Dice.roll(baseEnvStats().level(),20,baseEnvStats().level()));

		recoverMaxState();
		resetToMaxState();
		recoverEnvStats();
		recoverCharStats();
	}
	public Environmental newInstance()
	{
		return new Rattlesnake();
	}
}